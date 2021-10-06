@Test
    public void testCloning() throws CloneNotSupportedException {
        AreaRenderer r1 = new AreaRenderer();
        AreaRenderer r2 = (AreaRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    