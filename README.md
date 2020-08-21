# Octree
![Maven Releases](https://www.ryandw11.com/api/repo-badge/maven-releases/me.ryandw11/Octree) ![Maven Releases](https://www.ryandw11.com/api/repo-badge-snapshot/maven-snapshots/me.ryandw11/Octree)

Here is an octree system to use in Java. This system allows you to store object with the tree, and retreive them.

## Using Maven
Step 1: Add my release repository.
```xml
<repositories>
    <repository>
        <id>Ryandw11</id>
        <url>https://repo.ryandw11.com/repository/maven-releases/</url>
    </repository>
</repositories>
```
Step 2: Add the dependency
```xml
<dependency>
    <groupId>me.ryandw11</groupId>
    <artifactId>Octree</artifactId>
    <version>1.0</version>
</dependency>
```

## Using Gradle
```gradle
repositories {
    maven { url 'https://repo.ryandw11.com/repository/maven-releases/' }
}
dependencies {
    implementation 'me.ryandw11:Octree:1.0'
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
