@Test
    public void testCloning() throws CloneNotSupportedException {
        ArrowNeedle n1 = new ArrowNeedle(false);
        ArrowNeedle n2 = (ArrowNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    