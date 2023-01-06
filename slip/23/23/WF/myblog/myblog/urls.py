from django.contrib import admin
from django.urls import path
from blog.views import frontpage, post_detail

urlpatterns = [
    path('', frontpage, name='frontpage'),
    path('admin/', admin.site.urls),
    path('post_detail/', post_detail, name = 'post_detail')
]
