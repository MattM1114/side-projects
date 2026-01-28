#include <iostream>
using namespace std;

int main() {
  int num;
  cout << "enter a number: ";
  cin >> num;

  for (size_t i = 0; i <= 12; i++)
  {
    /*this will generate the multiplication table of the given number*/
    cout << num << " * " << i << " = " << num * i << endl;
  }
  return 0;
  
}