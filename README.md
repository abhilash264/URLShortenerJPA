# URLShortenerJPA
We all know how a long URL makes tough get going.
So Here is the back-end part of an URLShortener web-app where it illustrates how these URLShortener websites like-@bit.ly works.
I have used Spring Data JPA and MYSQL to store my shortURL,OriginalURL so that wherever the user will hit the shortURL it will hit that API to redirect to the Original URL.
The Hash-Function used here is murmur hashing to convert from Original URL to Short URL(encoded).
Next I'm gonna do the same thing but Using Spring Data Redis, where it will significantly increase my Performance with the help of Redis caching.
