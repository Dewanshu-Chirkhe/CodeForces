#include<bits/stdc++.h>
using namespace std;

int main(){
    string a , b;
    cin >> a >> b;
    int str1 = 0 , str2 = 0;
    for(int i=0 ; i<a.size() ; i++){
        char ca = toupper(a[i]);
        char cb = toupper(b[i]);
        if(ca < cb) {
            cout << "-1";
            return 0;
        }
        else if(ca > cb){
            cout << "1";
            return 0;
        }
    }   
    cout << "0";
    return 0;
}