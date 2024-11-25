# kata_dni

922 / 5 000
Create a console application that calculates the letter of the DNI (National Identity Document).

The algorithm to calculate the letter of the DNI is the following:
The number must be between 0 and 99999999
We take the complete number of up to 8 digits of our DNI, divide it by 23 and keep the remainder of said division (modulo 23)
Depending on the result, from 0 to 22, it will correspond to one of the following letters: (T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E)
If the data entered is not a number, a message should be indicated that "the data entered is incorrect" and the user should be asked again.
The process should be repeated until the user enters a valid number.
Requirements:
Unit tests must be performed (minimum coverage 70%)
Deliverables:
GitHub repository (link)
Screenshot of the "Testing" section of Visual Studio Code where the coverage of the tests can be seen