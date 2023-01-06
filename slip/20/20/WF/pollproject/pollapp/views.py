from django.shortcuts import render

# Create your views here.'

def home(request):
    context = {}
    return render(request, 'pollapp/home.html', context)

def create(request):
 context = {}
 return render(request, 'pollapp/create.html', context)

def results(request):
 context = {}
 return render(request, 'pollapp/results.html', context)

def vote(request):
 context = {}
 return render(request, 'pollapp/vote.html', context)
