#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int remainder = n % 3;
        string ans;
        if(remainder == 0) ans = "Second";
        else ans = "First";
        cout << ans << endl;
    }
}