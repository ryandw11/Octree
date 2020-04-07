# Octree
[![](https://jitpack.io/v/ryandw11/Octree.svg)](https://jitpack.io/#ryandw11/Octree)

Here is an octree system to use in Java. This system allows you to store object with the tree, and retreive them.

## Using Maven
Step 1: Add the jitpack repository if you don't already have it.
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Step 2: Add the dependency
```xml
<dependency>
    <groupId>com.github.ryandw11</groupId>
    <artifactId>Octree</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

## Using Gradle
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.ryandw11:Octree:master-SNAPSHOT'
}
```

# Octree Usage
The octree is a generic class. You can tell it what value you want to store at each point.
```java
Octree<String> octree = new Octree<>(0,0,0, 7, 7, 7);
```
The 0, 0, 0  is the 3d point. 7, 7, 7 is also a 3d point. Those two points are the bounds of the tree. You cannot have any points outside of the bounds.  

## Adding values
```java
octree.insert(4, 5, 4, "hello world!");
```

## Checking for existance
```java
octree.find(4, 5, 4); // returns true
```

## Getting the value of a point
```java
String s = octree.get(4, 5, 4);
// s than equals "hello world!"
```

## Removing a point
```java
octree.remove(4, 5, 4);
// Returns a boolean if it was successful or not.
```
