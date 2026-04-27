#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int capacity = 0 , current = 0;
    for(int i=0 ; i<n ; i++){
        int a , b;
        cin >> a >> b;
        current = current - a + b;
        capacity = max(capacity , current);
    }
    cout << capacity << endl;
    return 0;
}