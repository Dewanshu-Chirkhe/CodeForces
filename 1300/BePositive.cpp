#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int neg = 0 , zero = 0;
        for(int i=0 ; i<n ; i++){
            int num;
            cin >> num;
            if(num == 0) zero++;
            else if(num < 0) neg++;
        }
        int ans = 0;
        if(neg % 2 != 0) ans += 2;
        ans += zero;
        cout << ans << endl;
    }
    return 0;
}