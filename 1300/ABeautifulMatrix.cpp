#include<bits/stdc++.h>
using namespace std;

int main(){
    vector<vector<int>> arr(5 , vector<int>(5 , 0));

    for(int i=0 ; i<5 ; i++){
        for(int j=0 ; j<5 ; j++){
            cin >> arr[i][j];
            if(arr[i][j] == 1){
                int dist = abs(i - 2) + abs(j - 2);
                cout << dist;
                return 0;
            }
        }
    }
}