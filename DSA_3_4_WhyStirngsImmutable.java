public class DSA_3_4_WhyStirngsImmutable {
    /*
    Security:

Strings are widely used for storing sensitive information such as usernames, passwords, and URLs. If strings were mutable, a change in the string could affect various parts of an application in unexpected ways, leading to security vulnerabilities. For example, an unintentional or malicious modification to a URL string could redirect traffic to a harmful website.
Thread Safety:

In a multithreaded environment, immutable objects are inherently thread-safe. Since strings cannot be changed after they are created, multiple threads can safely share and use the same string instance without requiring synchronization. This eliminates the need for complex locking mechanisms, reducing the potential for deadlocks and race conditions.
Caching and Performance:

String immutability allows for efficient caching and reuse of string instances. The Java String pool, which is a special memory region for storing common strings, relies on string immutability. When a string literal is created, the Java Virtual Machine (JVM) checks the pool first. If the string already exists in the pool, the JVM reuses the existing string rather than creating a new one. This can lead to significant memory savings and improved performance.
HashCode Caching:

Immutable objects can cache their hash code, which is often computed only once and reused. For strings, the hash code is frequently used, for example, in hash-based collections like HashMap and HashSet. By caching the hash code, lookups and insertions become faster since the hash code doesn’t need to be recalculated.
Design Simplicity:

Immutable objects simplify the design and implementation of various data structures. For instance, when using strings as keys in collections, immutability ensures that the key does not change, thus preserving the integrity of the data structure.
Consistency and Predictability:

Immutability ensures that strings remain consistent throughout their lifetime. This predictability simplifies debugging and reasoning about code, as developers can be confident that a string value will not change unexpectedly.
     */
}
