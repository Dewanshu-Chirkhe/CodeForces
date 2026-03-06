#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string str;
        cin >> str;
        int countHoles = 0;
        int ans = 0;
        
        for(char ch : str){
            if(ch == '.'){
                countHoles++;
                ans++;
                if(countHoles >= 3){
                    ans = 2;
                    break;
                }
                ans = max(ans, countHoles);
            }
            else countHoles = 0;
        }

        cout << ans << endl;
    }
}