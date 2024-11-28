# kata_dni

The DNI Calculator is a simple Java application designed to calculate the letter corresponding to a DNI (Documento Nacional de Identidad) number. The program interacts with the user, validates the input, computes the corresponding letter using a predefined algorithm, and displays the result. It follows the MVC (Model-View-Controller) pattern to maintain a clean and organized structure.

# Features
- DNI Number Validation: Ensures the entered DNI number is a numeric value within the valid range (0–99,999,999).
- Letter Calculation: Uses a standard algorithm based on modulus division (dniNumber % 23) to compute the corresponding letter for the DNI number.
- User Interaction: Provides a user-friendly interface through the console for entering the DNI number and displaying the result.
- Error Handling: Displays clear error messages for invalid inputs, such as non-numeric values or numbers out of range.

# Technologies Used
Java: The core programming language used to implement the application.

Java SE Scanner: Utilized for reading user input from the console.

MVC Pattern: Ensures a modular design by separating concerns into distinct Model, View, and Controller components.

# Installation

git clone https://github.com/NepyAnna/kata_dni.git

# Authors

NepyAnna [![NepyAnna](https://img.icons8.com/ios-glyphs/30/000000/github.png)](https://github.com/NepyAnna)
