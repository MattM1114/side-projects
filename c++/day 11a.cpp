#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Number of students :";
  cin >> n;

  int marks[n];
  int sum = 0;

  for (int i = 0; i < n; i++) {
    cout << "Enter mark" <<i+1 <<";";
    cin >> marks[i];
    sum += marks[i];
  }

  int highest = marks[0];
  int lowest = marks[0];
  for (int i = 1; i < n; i++) {
    if (marks[i] > highest)
      highest = marks[i];
    if (marks[i] < lowest) 
      lowest = marks[i];
    

  }

  double average = (double)sum / n;

cout << "Highest: " << highest << endl;
cout << "lowest: " << lowest << endl;
cout << "Average: " << average << endl;

return 0;

}