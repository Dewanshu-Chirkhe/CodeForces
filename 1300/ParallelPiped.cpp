#include <bits/stdc++.h>
using namespace std;

int main() {
    double ab, bc, ca;
    cin >> ab >> bc >> ca;

    double a = sqrt((ab * ca) / bc);
    double b = sqrt((ab * bc) / ca);
    double c = sqrt((bc * ca) / ab);

    cout << fixed << setprecision(0) << 4 * (a + b + c) << endl;
    return 0;
}
