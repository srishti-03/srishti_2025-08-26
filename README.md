STORE MONITORING
This project monitors restaurants' uptime/downtime during business hours and generates detailed reports.

🚀 How to Run
1. Clone the repo:
   ```
   git clone https://github.com/srishti-03/srishti_2025-08-26.git
   cd srishti_2025-08-26
   ```
2. Build and run:
   ```
   mvn clean package
   java -jar target/store-monitoring-*.jar
   ```
3. Run the Application
   
   Option 1 — Using JAR
   ```
   java -jar target/store-monitoring-0.0.1-SNAPSHOT.jar
   ```
   
   Option 2 — Using IntelliJ
   
   Open the project in IntelliJ IDEA

   Go to src/main/java/com/store/monitoring/StoreMonitoringApplication.java

   Right-click → Run 'StoreMonitoringApplication'
   

4. Verify the Application

   Open in browser or Postman:

   http://localhost:8080/stores

   

📌 TECH STACK

   Java 21
   Spring Boot 3.x
   Spring Data JPA
   H2 Database (or your configured DB)
   

📖 API ENDPOINTS

   GET /stores → List all stores
   POST /stores → Add a new store
   GET /stores/{id} → Get store by ID
   PUT /stores/{id} → Update a store
   DELETE /stores/{id} → Delete a store

🎥 Demo Video
   Watch a quick demo of the project here: [Loom Recording](https://www.loom.com/share/b4e2aceaaa404ab39c294b0be0c17f41?sid=1dc5b8cd-3c85-4130-bc12-347d275ae6bf)   

📂 Sample Output
You can check a sample API response in CSV format here: [sample_output.csv](./sample_output.csv)
   

   
