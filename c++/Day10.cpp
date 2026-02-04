#include <iostream>
using namespace std;

/* this will convert a temperature in Celsius to Fahrenheit */
double cel_to_fahr(double c) {
  return (c * 9 / 5) + 32;
}

/*this will convert a temperture in Fahrenheit to Celsius */
double fahr_to_cel(double f) {
  return (f - 32) * 5 / 9;
}

// this function will change kilometers to miles
double km_to_miles(double km) {
  return km * 0.621371;
}

// this function will change miles to kilomeeters

double miles_to_km(double m) {
  return m/0.621371;
}

// this is the main function

int main() {
  int choice; // this will used to get user input that will be used for the switch statement
  double val;    // this will hold the temperature value, distance value.

cout << "1. Celsius to Fahrenheit"<<endl;
cout << "2.Fahrenheit to Celsius" << endl;
cout << "3.Kilometers to Miles"<< endl;
cout<<"4.Miles to kilometers"<<endl; 
cout<<"Enter a choice: ";
cin >> choice;



  switch (choice)
  {
  case 1:
    /* code */
    cout << "Enter the temperature in Celsius: ";
    cin >> val;
    cout << "The temperature in Fahrenheit is: " << cel_to_fahr(val);
    break;
  case 2:
    cout << "Enter the temperature in Fahrenheit: ";
    cin >> val;
    
    cout << "The temperature in Celsius is: " << fahr_to_cel(val);
    break;
  case 3:
    cout << "Enter the distance in kilometers: ";
    cin >> val;
    cout << "The distance in miles is: " << km_to_miles(val);
    break;
  case 4:
    cout << "Enter the distance in miles: ";
    cin >> val;
    cout << "The distance in kilometers is: " <<miles_to_km(val);
    break;
  default:
    cout << "Invalid choice. Please try again."<<endl;
    break;
  };

  return 0;

}