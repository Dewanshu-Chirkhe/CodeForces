#include<bits/stdc++.h>
using namespace std;

int main(){
    int k , l , m , n , d;
    cin >> k >> l >> m >> n >> d;
    vector<bool> arr(d , false);
    int count = 0;
    for(int i=0 ; i<d ; i++){   
        if((i+1) % k == 0 
        || (i+1) % l == 0
        || (i+1) % m == 0
        || (i+1) % n ==0
        && arr[i] == false){
            arr[i] = true;
            count++;
        }
    }
    cout << count << endl;
    return 0;
}