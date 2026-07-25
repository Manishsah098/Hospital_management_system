# Hospital Management System 🏥

A comprehensive, desktop-based GUI application built using **Java (Swing/AWT)** and **MySQL**. This software is designed to simplify and streamline the daily operations of a hospital, clinic, or medical center. It provides an intuitive interface for hospital staff to manage patients, rooms, employees, and ambulance services efficiently.

---

## 🚀 Features

- **Secure Login System**: Authentication portal for receptionists, doctors, and admins.
- **Reception Dashboard**: A centralized, easy-to-navigate dashboard with quick access to all essential hospital functions.
- **Patient Management**:
  - Add new patient details and allocate beds/rooms.
  - View comprehensive patient records.
  - Update patient details (e.g., room changes, status updates).
  - Patient discharge system.
- **Hospital Infrastructure**:
  - View real-time room availability.
  - Search for specific room types and statuses.
  - View and manage hospital departments.
- **Staff Management**: Access to all employee and manager information.
- **Emergency Services**: Track and manage hospital ambulance services.

---

## 🛠️ Technology Stack

- **Frontend/GUI**: Java Swing & AWT
- **Backend**: Java (JDK 8 or higher)
- **Database**: MySQL
- **Database Connectivity**: JDBC (Java Database Connectivity)
- **IDE**: IntelliJ IDEA / Eclipse / NetBeans

---

## 📋 Prerequisites

Before you begin, ensure you have met the following requirements:
1. **Java Development Kit (JDK)** installed on your machine.
2. **MySQL Server** installed and running.
3. **MySQL Connector/J** (JDBC Driver) added to your project dependencies.
4. Any standard IDE (IntelliJ IDEA recommended).

---

## ⚙️ Setup & Installation

1. **Clone or Download the Repository:**
   Open the project folder in your preferred Java IDE (e.g., IntelliJ IDEA).

2. **Database Configuration:**
   - Open MySQL Workbench or your terminal.
   - Create a new database (e.g., `hospital_management_system`).
   - Import the required tables (patients, login, room, department, employee, ambulance).
   - Navigate to `src/hospital/management/system/conn.java` and update the database credentials (URL, Username, Password) to match your local MySQL configuration.

3. **Add JDBC Driver:**
   Ensure `mysql-connector-java.jar` is added to your project's build path/libraries.

4. **Run the Application:**
   Run the `Login.java` or `Reception.java` file to start the graphical user interface.

---

## 📂 Project Structure

```text
src/
├── hospital/management/system/
│   ├── Login.java                # Authentication Page
│   ├── Reception.java            # Main Dashboard UI
│   ├── conn.java                 # Database Connection Class
│   └── ... (Other form modules)
├── icon/                         # UI Assets and Images
│   ├── dr.png                    
│   ├── amb.png                   
│   └── ...
```

---

## 🖼️ Screenshots
*(Add screenshots of your application here, e.g., the Login Screen, Reception Dashboard, and Add Patient Form).*

---

## 🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to modify the UI or add new backend features to extend the system's capabilities.
