#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int lowest , highest;
    int awesome = 0;
    for(int i=0 ; i<n ; i++){
        int num;
        cin >> num;
        if(i == 0){
            lowest = num;
            highest = num;
        }
        else{
            if(num < lowest){
                lowest = num;
                awesome++;
            }
            else if(num > highest){
                highest = num;
                awesome++;
            }
        }
    }
    cout << awesome << endl;
    return 0;
}