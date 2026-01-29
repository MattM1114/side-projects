// fibonacci number genartor
#include <iostream>
using namespace std;

int main() {
  int num,a=0,b=1 ,next; // this will be the number that the user will enter to get the
           // fibonaci number of
  
  cout << "pleas enter a number" << endl;
  cin >> num;
  cout << "Fibonacci sequnce: " << endl;
  for (int i = 0; i <= num; i++) {
    cout << a << " ";
    next = a + b;
    a = b;
    b= next;
  }
  return 0;
  
}