class MovieTwo {
    public static void main(String[] args) {
        String [] movies =  { "Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom","Indiana Jones and the Last Crusade"};
        String [][] actors = {
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"},
                {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };
            for (int i = 0; i < movies.length; i++) {
                    System.out.println( movies[i] +  actors [i][0] + actors [i][1] +  actors [i][2]);
            }
        }


    }