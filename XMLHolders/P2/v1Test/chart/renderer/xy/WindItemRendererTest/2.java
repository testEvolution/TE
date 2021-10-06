@Test
    public void testCloning() throws CloneNotSupportedException {
        WindItemRenderer r1 = new WindItemRenderer();
        WindItemRenderer r2 = (WindItemRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    