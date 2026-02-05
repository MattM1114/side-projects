#include <iostream>
#include <string>
using namespace std;

int main() {
    string txt;
    int vol = 0, dig = 0, spaces = 0,chr = 0;

    cout << "Enter a secentence: " << endl;
    getline(cin, txt);
    for (char c: txt) {
        if (c ==' ')
        {
            spaces++;
        } else {
        chr++;
        if (c >= '0' && c <= '9') {
            dig++;
        } else if (c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c =='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            vol++;
        }
        
        }
    }
    cout << "The number of characters in the sentence is that are not spaces are: " << chr << endl;
    cout << "The number of digits in the sentence is: " << dig << endl;
    cout << "The number of vowels in the sentence is: " << vol << endl;
    cout << "The number of spaces in the sentence is: " << spaces << endl;

    return 0;
};
