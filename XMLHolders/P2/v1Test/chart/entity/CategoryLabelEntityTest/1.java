@Test
    public void testCloning() throws CloneNotSupportedException {
        CategoryLabelEntity e1 = new CategoryLabelEntity("A",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), "ToolTip", "URL");
        CategoryLabelEntity e2 = (CategoryLabelEntity) e1.clone();
        assertTrue(e1 != e2);
        assertTrue(e1.getClass() == e2.getClass());
        assertTrue(e1.equals(e2));
    }

    