@Test
    public void testCloning() throws CloneNotSupportedException {
        LineNeedle n1 = new LineNeedle();
        LineNeedle n2 = (LineNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    