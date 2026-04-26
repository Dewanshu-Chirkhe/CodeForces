#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    vector<int> arr(n);
    for(int i=0 ; i<n ; i++) cin >> arr[i];

    int last = 0, maxTurn = 0;
    for(int i=0 ; i<n ; i++){
        int turn = (arr[i] + m - 1) / m;
        if(turn >= maxTurn){
            maxTurn = turn;
            last = 1 + i;
        }
    }
    cout << last << endl;
    return 0;
}