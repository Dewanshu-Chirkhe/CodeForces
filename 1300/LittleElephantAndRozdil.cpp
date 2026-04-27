#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    int minm = INT_MAX , minCount = 1 , idx = -1;
    for(int i=0 ; i<n ; i++){
        cin >> arr[i];
        if(arr[i] == minm) minCount++;
        if(arr[i] < minm){
            minm = arr[i];
            minCount = 1;
            idx = i;
        }
    }
    if(minCount > 1) cout << "Still Rozdil" << endl;
    else cout << idx+1 << endl;
    return 0;
}