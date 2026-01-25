#include <iostream>
#include <string>
using namespace std;

int main() {
  double num1, num2, sum;
  cout << "Enter two numbers: ";
  cin >> num1 >> num2;
  sum = num1 + num2;
  cout << "sum:" << sum << endl;
  
  int age = 25;
  float height = 5.9;
  string name = "Matt";
  cout << "name:" << name << endl
       << "age:" << age << endl
       << "height:" << height << " feet" << endl;
  cout << "what is your name and  age ?" << endl;
  string user;
  cin >> user >> age;
    cout << "Hello " << user << ", you are " << age << " years old." << endl;
  
    return 0;
}