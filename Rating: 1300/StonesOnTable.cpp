#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    string str;
    cin >> n >> str;
    int ans = 0;
    for(int i=1 ; i<n ; i++){
        if(str[i] == str[i-1]) ans++;
    }

    cout << ans << endl;
    return 0;
}