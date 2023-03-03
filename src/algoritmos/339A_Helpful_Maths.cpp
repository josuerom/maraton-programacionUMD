/**
* author:  josuerom
* created: 13/02/23 15:26
**/
#pragma GCC optimize("03,unroll-loops")
#include <bits/stdc++.h>
using namespace std;

int main() {
   ios::sync_with_stdio(false); cin.tie(0);
   char s[10000], clone[10000], c[1];
   string str, aux;
   cin.getline(s, 10000, '\n');
   int n = strlen(s);
   int symbols = (n-1);
   for (int h = 0; h < n; h++) {
      if (s[h]!='+') str += s[h];
   }
   for (int i = 0, j = 0; i < n; i++) {
      if (s[i] == '+') clone[j++] = s[i];
   }
   sort(str.begin(), str.end());
   for (int f = 1, i = 0, j = 0; f <= n; f++) {
      if (f%2!=0) aux += str[i++];
      else aux += clone[j++];
   }
   cout << aux << '\n';
   return 0;
}
