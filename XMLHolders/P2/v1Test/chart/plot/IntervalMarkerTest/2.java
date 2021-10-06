@Test
    public void testCloning() throws CloneNotSupportedException {
        IntervalMarker m1 = new IntervalMarker(45.0, 50.0);
        IntervalMarker m2 = (IntervalMarker) m1.clone();
        assertTrue(m1 != m2);
        assertTrue(m1.getClass() == m2.getClass());
        assertTrue(m1.equals(m2));
    }

   