#include<bits/stdc++.h>
using namespace std;

int main(){
    vector<vector<int>> arr(3 , vector<int>(3 , 0));
    for(int i=0 ; i<3 ; i++)
        for(int j=0 ; j<3 ; j++)
            cin >> arr[i][j];

    for(int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            int state = arr[i][j];
            if(i > 0) state += arr[i-1][j];
            if(j > 0) state += arr[i][j-1];
            if(i < 2) state += arr[i+1][j];
            if(j < 2) state += arr[i][j+1];

            state = (1 + state) % 2;
            cout << state;
        }
        cout << endl;
    }
    return 0;
}