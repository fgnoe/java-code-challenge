## Problem Description

Given an image, imagine it divided into a 3x3 grid (9 equal sections).  Each section is labeled 1 through 9:

```
1 2 3
4 5 6
7 8 9
```

These sections are grouped into "buckets":

* **Corners:** Sections 1, 3, 7, 9
* **Sides:** Sections 2, 4, 6, 8
* **Center:** Section 5

You'll receive:

* The image's dimensions (`Size`)
* A bounding box's coordinates and dimensions (`BoundingBox`)

Your task is to write a Java function named `findBucketWithMostOverlap` that determines which bucket has the most overlap with the given bounding box.
The function should return the corresponding value of the `BucketEnum`.

## Function Signature

```java
static BucketEnum findBucketWithMostOverlap(Size imageSize, BoundingBox boundingBox) 
```

## Input Parameters

* `imageSize`: An instance of the `Size` class containing the image's width and height.
* `boundingBox`: An instance of the `BoundingBox` class containing the top-left corner coordinates (x, y) and the width and height of the bounding box.

## Return Value

* A value from the `BucketEnum` representing the bucket with the most overlap:
    * `BucketEnum.CORNERS`
    * `BucketEnum.SIDES`
    * `BucketEnum.CENTER`


## Examples

1. Given a 900x900 image and a bounding box at (100, 450) with dimensions 300x200, the function should return `BucketEnum.SIDES`.

2. Given a 900x900 image and a bounding box at (0, 300) with dimensions 900x350, the function should return `BucketEnum.SIDES`.

3. Given a 900x900 image and a bounding box at (250, 250) with dimensions 600x600, the function should return `BucketEnum.CENTER`.


