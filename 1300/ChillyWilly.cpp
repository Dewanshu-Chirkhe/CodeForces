#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    if(n < 3){
        cout << -1 << endl;
        return 0;
    }
    long long start = 1 , end = 10;
    for(int i=1 ; i<n ; i++){
        start *= 10;
        end *= 10;
    }
    for(long i=start ; i<end ; i++){
        if(i % 210 == 0){
            cout << i << endl;
            return 0;
        }
    }
    cout << -1 << endl;
    return 0;
}