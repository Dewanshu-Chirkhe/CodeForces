#include <bits/stdc++.h>
using namespace std;

int main(){
    ifstream fin("../input.txt");
    long num;
    fin >> num;
    while(num > 0){
        int last = num % 10;
        if(last != 4 && last != 7){
            cout << "NO" << endl;
            return 0;
        }
        num /= 10;
    }
    cout << "YES" << endl;
    return 0;
}
