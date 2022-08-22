import cv2 as cv
import cv2
img = cv2.imread('C:\\Users\\Pimuk\\Pictures\\InkedIMG_2336.jpg')

gray = cv2.cvtColor(img , cv2.COLOR_BGR2GRAY)

cv2.imshow('Pictures' , gray)
cv2.waitKey(0)
cv2.destroyAllWindows()