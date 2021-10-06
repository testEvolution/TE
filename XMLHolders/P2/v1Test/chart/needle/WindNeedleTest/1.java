@Test
    public void testCloning() throws CloneNotSupportedException {
        WindNeedle n1 = new WindNeedle();
        WindNeedle n2 = (WindNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    