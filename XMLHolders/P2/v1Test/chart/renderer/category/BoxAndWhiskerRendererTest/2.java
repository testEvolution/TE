@Test
    public void testCloning() throws CloneNotSupportedException {
        BoxAndWhiskerRenderer r1 = new BoxAndWhiskerRenderer();
        BoxAndWhiskerRenderer r2 = (BoxAndWhiskerRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    