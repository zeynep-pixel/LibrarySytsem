
def ilerle(control(maze,x,i)):
        
    
        if control == True:
            if x < len(maze[0]):
                x = x+1
            elif i < len(maze):
                i = i+1
            else:
                print("solved.")
        else:
            if i <len(maze):
             i = i+1
             x = x +1

       

def control(maze,x,i):
    
    if maze[x][i]==0:
      print("a")

      return True
    else:
      return False


maze = [
    [0, 0, 0, 0, 0],
    [0, 0, 1, 0, 1],
    [0, 0, 0, 0, 1],
    [0, 1, 1, 0, 1],
    [0, 1, 1, 0, 0]
]



ilerle(control(maze,0,0))