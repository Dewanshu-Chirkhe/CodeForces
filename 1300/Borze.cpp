#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin >> str;
    int n = str.size();
    string ans = "";
    for(int i=0 ; i<n ; i++){
        char ch = str[i];
        if(ch == '.') ans += '0';
        else if(ch == '-'){
            if(str[i+1] == '.') ans += '1';
            else if(str[i+1] == '-') ans += '2';
            i++;
        }
    }
    cout << ans << endl;
    return 0;
}