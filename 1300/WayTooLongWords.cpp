#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    while(n--){
        string str;
        cin >> str;
        if(str.size() > 10){
            string abbree = "";
            abbree += str[0];
            abbree += to_string(str.size() - 2);
            abbree += str[str.size() - 1];
            cout << abbree << endl;
        }
        else cout << str << endl;
    }
    return 0;
}