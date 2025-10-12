#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    int diff = INT_MAX;
    int x, y;
    for(int i=0 ; i<n ; i++){
        cin >> arr[i];
        if(i == 0) continue;
        else{
            int sub = abs(arr[i] - arr[i-1]);
            if(sub < diff){
                diff = sub;
                x = i , y = i+1;
            }
        }
    }
    if(abs(arr[0] - arr[n-1]) < diff){
        x = n , y = 1;
    }
    cout << x << " " << y << endl;
    return 0;
}