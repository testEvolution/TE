@Test
    public void testCloning() throws CloneNotSupportedException {
        PlumNeedle n1 = new PlumNeedle();
        PlumNeedle n2 = (PlumNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    