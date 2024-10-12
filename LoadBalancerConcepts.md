In the setup you described, the **load balancing** happens in two possible areas:

1. **Between the API Gateway and Microservices** (internal load balancing).
2. **At the API Gateway level** (external load balancing, optional).

### 1. **Internal Load Balancing: API Gateway to Microservices**

When the **API Gateway** communicates with multiple instances of a microservice (discovered via the Eureka Server), it acts as a **client-side load balancer**. Here’s how it works:

- The API Gateway queries **Eureka Server** to find all instances of a specific microservice. Eureka returns a list of available instances.
- The API Gateway then applies a **load balancing strategy** (e.g., **Round Robin**, **Random**, **Least Connections**, etc.) to select one of the instances.
- It forwards the request to the selected microservice instance.
  
This load balancing happens inside the **API Gateway** itself. **Netflix Ribbon** or **Spring Cloud LoadBalancer** can be used to handle this logic.

#### Key Points:
- This is **client-side load balancing**, meaning the client (API Gateway in this case) is responsible for choosing which instance of the microservice to communicate with.
- It’s highly dynamic because the list of available instances is fetched from **Eureka**, which constantly updates based on the health of the services.

### 2. **External Load Balancing: Load Balancer to API Gateway** (Optional)

In many systems, you might also have a **load balancer** in front of the API Gateway, especially in cloud environments. This is often an **external load balancer**, which helps distribute client requests to multiple instances of the **API Gateway** itself.

#### Why External Load Balancer?

- **High Availability**: If you have multiple instances of the API Gateway (for fault tolerance), the external load balancer will distribute requests evenly between the API Gateway instances.
- **Scaling**: As traffic increases, the external load balancer can send traffic to new instances of the API Gateway that are automatically spun up to handle the load.

Common external load balancers include:
- **Elastic Load Balancer (ELB)** in AWS
- **Google Cloud Load Balancing**
- **Azure Load Balancer**
  
In this case:
- **User Request** → Load Balancer → **API Gateway** → Eureka → Microservice

### Where Load Balancers Operate:
1. **External Load Balancer (if used)**: Balances requests between multiple API Gateway instances.
2. **Client-Side Load Balancer (API Gateway)**: Balances requests between microservice instances after discovering them through Eureka.

### Complete Flow Example:
1. **UI (Client)** sends a request to the system (e.g., `http://yourapp.com`).
2. The request hits the **external load balancer** (e.g., ELB in AWS), which distributes the request to one of the available **API Gateway** instances.
3. The selected API Gateway instance queries the **Eureka Server** to get a list of all instances of the required microservice.
4. The API Gateway uses its **internal load balancing** logic (e.g., Ribbon or Spring Cloud LoadBalancer) to select an instance of the microservice.
5. The API Gateway forwards the request to the selected microservice instance.
6. The microservice processes the request and sends the response back to the **API Gateway**.
7. The **API Gateway** forwards the response to the **UI (Client)**.

### Summary:
- **Internal Load Balancer**: Happens between the API Gateway and the microservices, where the API Gateway decides which microservice instance to forward the request to.
- **External Load Balancer**: If used, sits in front of the API Gateway, distributing incoming traffic between multiple API Gateway instances.

In many cases, cloud-based environments will handle the **external load balancing** automatically, while the **API Gateway** takes care of **internal load balancing** between microservices.
