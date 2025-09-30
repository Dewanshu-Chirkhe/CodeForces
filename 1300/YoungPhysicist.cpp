#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;

    vector<vector<int>> arr(n , vector<int>(3 , 0));
    for(int i=0 ; i<n ; i++){
        cin >> arr[i][0] >> arr[i][1] >> arr[i][2];
    }

    int xTotal=0 , yTotal=0 , zTotal=0;
    for(int i=0 ; i<n ; i++){
        xTotal += arr[i][0];
        yTotal += arr[i][1]; 
        zTotal += arr[i][2];
    }
    if(xTotal == 0 && yTotal == 0 && zTotal == 0) cout << "YES";
    else cout << "NO";
    return 0;
}