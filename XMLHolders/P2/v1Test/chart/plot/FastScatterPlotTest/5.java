private float[][] createData() {
        float[][] result = new float[2][1000];
        for (int i = 0; i < result[0].length; i++) {
            float x = (float) i + 100;
            result[0][i] = x;
            result[1][i] = 100 + (float) Math.random() * 1000;
        }
        return result;
    }

}