from turtle import left, right
import face_recognition as fr
import numpy
import cv2

img = cv2.imread("_DSC0004.jpg")
img = cv2.resize(img,(800,600))
face_locate = fr.face_locations(img)
for face in face_locate :
    top,right,bottom,left = face
    img = cv2.rectangle(img,(left,top),(right,bottom),(0,0,225),2)

cv2.imshow("Face Detected" , img)
cv2.waitKey(0)
cv2.destroyAllWindows()