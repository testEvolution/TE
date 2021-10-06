@Test
    public void testCloning() throws CloneNotSupportedException {
        XYBoxAndWhiskerRenderer r1 = new XYBoxAndWhiskerRenderer();
        XYBoxAndWhiskerRenderer r2 = (XYBoxAndWhiskerRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    