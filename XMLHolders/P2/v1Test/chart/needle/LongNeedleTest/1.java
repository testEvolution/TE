@Test
    public void testCloning() throws CloneNotSupportedException {
        LongNeedle n1 = new LongNeedle();
        LongNeedle n2 = (LongNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    